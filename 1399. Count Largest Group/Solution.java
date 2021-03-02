{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int countLargestGroup(int n) \{\
        List<Integer> ans=new ArrayList();\
        for(int i=1; i<=n; ++i)\
        \{\
            int curr=0, t=i;\
            while(t>0)\
            \{\
                curr+=t%10;\
                t/=10;\
            \}\
            if(ans.size()<curr)\
                ans.add(1);\
            else\
                ans.set(curr-1, ans.get(curr-1)+1);\
        \}\
        int max=0;\
        for(int i=0; i<ans.size(); ++i)\
            max=Math.max(max, ans.get(i));\
        int answer=0;\
        for(int i=0; i<ans.size(); ++i)\
            if(ans.get(i)==max)\
                answer++;\
        return answer;\
    \}\
\}}