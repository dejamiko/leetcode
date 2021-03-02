{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String[] uncommonFromSentences(String A, String B) \{\
        String[] c=A.split(" ");\
        String[] d=B.split(" ");\
        String[] ans=new String[c.length+d.length];\
        List<String> answer=new ArrayList();\
        for(int i=0; i<c.length; ++i)\
            ans[i]=c[i];\
        for(int i=0; i<d.length; ++i)\
            ans[i+c.length]=d[i];\
        Arrays.sort(ans);\
        for(int i=0; i+1<ans.length; ++i)\
        \{\
            if(!ans[i].equals(ans[i+1]))\
                answer.add(ans[i]);\
            else\
                while(i+1<ans.length && ans[i].equals(ans[i+1]))\
                      i++;\
        \}\
        if(!ans[ans.length-1].equals(ans[ans.length-2]))\
            answer.add(ans[ans.length-1]);\
        String[] a=new String[answer.size()];\
        for(int i=0; i<answer.size(); ++i)\
            a[i]=answer.get(i);\
        return a;\
    \}\
\}}