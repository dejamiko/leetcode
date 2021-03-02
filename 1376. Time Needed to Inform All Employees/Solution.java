{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) \{\
        int max=0;\
        for(int i=0; i<manager.length; ++i)\
            max=Math.max(max, helper(i, manager, informTime));\
        return max;\
    \}\
    \
    private int helper(int id, int[] manager, int[] informTime)\
    \{\
        if(manager[id]==-1)\
            return 0;\
        return informTime[manager[id]] + helper(manager[id], manager, informTime);\
    \}\
\}}