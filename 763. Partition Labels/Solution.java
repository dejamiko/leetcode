{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<Integer> partitionLabels(String S) \{\
        List<Integer> ans=new ArrayList<>();\
        for(int i=0; i<S.length(); ++i)\
        \{\
            int j=S.lastIndexOf(S.charAt(i));\
            for(int k=i; k<j && k<S.length();  ++k)\
                if(S.lastIndexOf(S.charAt(k))>j)\
                    j=S.lastIndexOf(S.charAt(k));\
            ans.add(j+1);\
            i=j;\
        \}\
        int sum=0;\
        for(int i=0; i<ans.size(); ++i)\
        \{\
            ans.set(i, ans.get(i)-sum);\
            sum+=ans.get(i);\
        \}\
        return ans;\
    \}\
\}}