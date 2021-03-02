{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int lastStoneWeight(int[] stones) \{\
        List<Integer> t=new ArrayList();\
        for(int i=0; i<stones.length; ++i)\
            t.add(stones[i]);\
        if(t.size()==1)\
            return t.get(0);\
        while(t.size()>1)\
        \{\
            int max1=t.get(0), index1=0;\
            for(int j=0; j<t.size(); ++j)\
                if(max1<t.get(j))\
                \{\
                    max1=t.get(j);\
                    index1=j;\
                \}\
            int max2=0, index2=0;\
            for(int j=0; j<t.size(); ++j)\
                if(max2<t.get(j) && j!=index1)\
                \{\
                    max2=t.get(j);\
                    index2=j;\
                \}\
            if(max1==max2)\
            \{\
                t.remove(Math.max(index1, index2));\
                t.remove(Math.min(index1, index2));\
            \}\
            else\
            \{\
                t.set(index1, max1-max2);\
                t.remove(index2);\
            \}\
        \}\
        if(t.size()>0)\
            return t.get(0);\
        else\
            return 0;\
    \}\
\}}