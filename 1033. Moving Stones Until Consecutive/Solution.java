{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] numMovesStones(int a, int b, int c) \{\
        int[] ans=new int[2];\
        int[] stones=new int[]\{a, b, c\};\
        Arrays.sort(stones);\
        if(stones[0]==stones[1]-1 && stones[0]==stones[2]-2)\
            return ans;\
        if(stones[0]==stones[1]-1 || stones[1]==stones[2]-1 || stones[0]==stones[1]-2 || stones[1]==stones[2]-2)\
            ans[0]=1;\
        else\
            ans[0]=2;\
        ans[1]=stones[2]-stones[0]-2;\
        return ans;\
    \}\
\}}