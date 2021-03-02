{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<Integer> luckyNumbers (int[][] matrix) \{\
        List<Integer> ans=new ArrayList<>();\
        for(int i=0; i<matrix.length; ++i)\
        \{\
            int min=matrix[i][0], index=0;\
            for(int j=0; j<matrix[i].length; ++j)\
                if(min>matrix[i][j])\
                \{\
                    min=matrix[i][j];\
                    index=j;\
                \}\
            boolean isLucky=true;\
            for(int j=0; isLucky && j<matrix.length; ++j)\
                if(matrix[j][index]>min)\
                    isLucky=false;\
            if(isLucky)\
                ans.add(min);\
        \}\
        return ans;\
    \}\
\}}