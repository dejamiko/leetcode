{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<Integer> getRow(int rowIndex) \{\
        List<Integer> one=new ArrayList();\
        List<Integer> two=new ArrayList();\
        one.add(1);\
        two.add(1);\
        two.add(1);\
        if(rowIndex==0)\
            return one;\
        if(rowIndex==1)\
            return two;\
        for(int i=2; i<=rowIndex; ++i)\
        \{\
            one=new ArrayList(two);\
            for(int j=1; j<i; ++j)\
                one.set(j, two.get(j-1)+two.get(j));\
            one.add(1);\
            two=new ArrayList(one);\
        \}\
        return one;\
    \}\
\}}