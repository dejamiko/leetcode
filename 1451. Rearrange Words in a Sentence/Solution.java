{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String arrangeWords(String text) \{\
        text=text.toLowerCase();\
        String[] t=text.split(" ");\
        String[] copy=new String[t.length];\
        for(int i=0; i<copy.length; ++i)\
        \{\
            int min=Integer.MAX_VALUE, index=i;\
            for(int j=0; j<t.length; ++j)\
                if(t[j]!=null && min>t[j].length())\
                \{\
                    min=t[j].length();\
                    index=j;\
                \}\
            copy[i]=t[index];\
            t[index]=null;\
        \}\
        char[] c=copy[0].toCharArray();\
        c[0]=(char)(c[0]-'a'+'A');\
        copy[0]=String.valueOf(c);\
        String ans="";\
        for(int i=0; i<copy.length; ++i)\
            ans=ans+copy[i]+" ";\
        ans=ans.trim();\
        return ans;\
    \}\
\}}