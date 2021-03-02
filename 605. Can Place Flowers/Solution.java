{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public boolean canPlaceFlowers(int[] flowerbed, int n) \{\
        if(flowerbed.length==1)\
            if(flowerbed[0]==0)\
                return n<2;\
            else\
                return n<1;\
        if(flowerbed[0]==0 && flowerbed[1]==0)\
        \{\
            flowerbed[0]=1;\
            n--;\
        \}\
        for(int i=2; n>0 && i+1<flowerbed.length; ++i)\
            if(flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0)\
            \{\
                flowerbed[i]=1;\
                i++;\
                n--;\
            \}\
        if(n>0 && flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0)\
            n--;\
        return n<1;\
    \}\
\}}