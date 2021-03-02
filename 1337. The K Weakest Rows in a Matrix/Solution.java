{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] kWeakestRows(int[][] mat, int k) \{\
        int[] temp=new int[mat.length];\
        int[] ans=new int[k];\
        for(int i=0; i<mat.length; ++i)\
        \{\
            int curr=0, j=0;\
            while(j<mat[0].length && mat[i][j++]==1)\
                curr++;\
            temp[i]=curr;\
        \}\
        for(int i=0; i<mat.length; ++i)\
            System.out.print(temp[i]+" ");\
        for(int i=0; i<k; ++i)\
        \{\
            int min=mat[0].length+100, index=0;\
            for(int j=0; j<mat.length; ++j)\
                if(min>temp[j])\
                \{\
                    index=j;\
                    min=temp[j];\
                \}\
            ans[i]=index;\
            for(int j=0; j<mat.length; ++j)\
                if(temp[j]==min)\
                \{\
                    temp[j]=mat[0].length+100;\
                    break;\
                \}\
        \}\
        return ans;\
    \}\
\}}