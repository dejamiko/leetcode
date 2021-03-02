{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<String> commonChars(String[] A) \{\
        int[] a=new int[26];\
        for(int i=0; i<A[0].length(); ++i)\
            a[A[0].charAt(i)-'a']++;\
        for(int i=1; i<A.length; ++i)\
        \{\
            int[] b=new int[26];\
            for(int j=0; j<A[i].length(); ++j)\
                b[A[i].charAt(j)-'a']++;\
            for(int j=0; j<26; ++j)\
                a[j]=Math.min(a[j], b[j]);\
        \}\
        ArrayList<String> ans=new ArrayList();\
        for(int i=0; i<26; ++i)\
            for(int j=0; j<a[i]; ++j)\
                ans.add(""+(char)(i+'a'));\
        return ans;\
    \}\
\}}