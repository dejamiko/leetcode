{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<Integer> powerfulIntegers(int x, int y, int bound) \{\
        HashSet<Integer> set=new HashSet<>();\
        if(x==1 && y==1)\
        \{\
            if(bound>=2)\
                return new ArrayList()\{\{add(2);\}\};\
            else\
                return new ArrayList();\
        \}\
        if(x==1)\
        \{\
            for(int i=0; Math.pow(y, i)+1<=bound; ++i)\
                set.add((int)Math.pow(y, i)+1);\
            return new ArrayList(set);\
        \}   \
        if(y==1)\
        \{\
            for(int i=0; Math.pow(x, i)+1<=bound; ++i)\
                set.add((int)Math.pow(x, i)+1);\
            return new ArrayList(set);\
        \}\
        for(int i=0; Math.pow(x, i)+1<=bound; ++i)\
            for(int j=0; Math.pow(x, i)+Math.pow(y, j)<=bound; ++j)\
                if(Math.pow(x, i)+Math.pow(y, j)<=bound)\
                    set.add((int)Math.pow(x, i)+(int)Math.pow(y, j));\
        return new ArrayList(set);\
    \}\
\}}