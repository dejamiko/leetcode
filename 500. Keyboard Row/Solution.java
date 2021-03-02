{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String[] findWords(String[] words) \{\
        String a="qwertyuiopQWERTYUIOP", b="asdfghjklASDFGHJKL", c="ZXCVBNMzxcvbnm";\
        List<String> ans=new ArrayList();\
        for(int i=0; i<words.length; ++i)\
        \{\
            int count1=0, count2=0, count3=0;\
            for(int j=0; j<words[i].length(); ++j)\
            \{\
                String t=String.valueOf(words[i].charAt(j));\
                if(a.contains(t))\
                    count1++;\
                if(b.contains(t))\
                    count2++;\
                if(c.contains(t))\
                    count3++;\
            \}\
            if(count1+count2==0 || count1+count3==0 || count2+count3==0)\
                ans.add(words[i]);\
        \}\
        return ans.toArray(new String[ans.size()]);\
    \}\
\}}