{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    \
    private int gcd(int a, int b)\
    \{\
        if(b==0)\
            return a;\
        else\
            return gcd(b, a%b);\
    \}\
    \
    \
    public boolean hasGroupsSizeX(int[] deck) \{\
        int[] a=new int[10001];\
        for(int i=0; i<deck.length; ++i)\
            a[deck[i]]++;\
        ArrayList<Integer> b=new ArrayList();\
        for(int i=0; i<10001; ++i)\
            if(a[i]!=0)\
                if(a[i]==1)\
                    return false;\
                else   \
                    b.add(a[i]);\
        int q=b.get(0);\
        for(int i=0; i<b.size(); ++i)\
        \{\
            int c=gcd(q, b.get(i));\
            if(c==1)\
                return false;\
            q=c;\
        \}\
        return true;\
    \}\
\}}