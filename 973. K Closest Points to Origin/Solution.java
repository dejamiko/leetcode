{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[][] kClosest(int[][] points, int K) \{\
        int[][] ans=new int[K][2];\
        for(int i=0; i<points.length; ++i)\
        \{\
            double min=Math.pow(points[i][0], 2)+Math.pow(points[i][1], 2);\
            int index=i;\
            for(int j=i+1; j<points.length; ++j)\
                if(min>Math.pow(points[j][0], 2)+Math.pow(points[j][1], 2))\
                \{\
                    min=Math.pow(points[j][0], 2)+Math.pow(points[j][1], 2);\
                    index=j;\
                \}\
            int[] t=points[index];\
            points[index]=points[i];\
            points[i]=t;\
        \}\
        for(int i=0; i<K; ++i)\
            ans[i]=points[i];\
        return ans;\
    \}\
\}}