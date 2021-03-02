{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int kthFactor(int n, int k) \{\
        ArrayList<Integer> factors=new ArrayList();\
        for(int i=1; i*i<=n; ++i)\
        \{\
            if(n%i==0)\
            \{\
                factors.add(i);\
                if(n/i!=i)\
                    factors.add(n/i);\
            \}\
        \}\
        int[] t=new int[factors.size()];\
        for(int i=0; i<factors.size(); ++i)\
            t[i]=factors.get(i);\
        Arrays.sort(t);\
        if(k>factors.size())\
            return -1;\
        return t[k-1];\
    \}\
\}}