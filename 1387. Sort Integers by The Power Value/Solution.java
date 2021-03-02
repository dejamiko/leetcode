{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int getKth(int lo, int hi, int k) \{\
        int[][] ans=new int[hi-lo+1][2];\
        for(int i=0; i<=hi-lo; ++i)\
        \{\
            int t=i+lo, power=0;\
            while(t!=1)\
            \{\
                if(t%2==0)\
                    t/=2;\
                else\
                    t=t*3+1;\
                power++;\
            \}\
            ans[i][1]=i+lo;\
            ans[i][0]=power;\
        \}\
        for(int i=0; i<hi-lo+1; ++i)\
            for(int j=0; j<hi-lo; ++j)\
                if(ans[j][0]>ans[j+1][0])\
                \{\
                    int[] t=ans[j];\
                    ans[j]=ans[j+1];\
                    ans[j+1]=t;\
                \}\
        return ans[k-1][1];\
    \}\
\}}