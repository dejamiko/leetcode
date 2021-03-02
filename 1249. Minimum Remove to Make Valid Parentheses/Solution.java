{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String minRemoveToMakeValid(String s) \{\
        int curr=0;\
        char[] ans=s.toCharArray();\
        for(int i=0; i<ans.length; ++i)\
        \{\
            if(ans[i]=='(')\
                curr++;\
            else if(ans[i]==')' && curr>0)\
                curr--;\
            else if(ans[i]==')' && curr==0)\
                ans[i]='.';\
        \}\
        curr=0;\
        for(int i=ans.length-1; i>=0; --i)\
        \{\
            if(ans[i]==')')\
                curr++;\
            else if(ans[i]=='(' && curr>0)\
                curr--;\
            else if(ans[i]=='(' && curr==0)\
                ans[i]='.';\
        \}\
        int num=0;\
        for(int i=0; i<ans.length; ++i)\
            if(ans[i]!='.')\
                num++;\
        char[] ns=new char[num];\
        int j=0;\
        for(int i=0; i<ans.length; ++i)\
            if(ans[i]!='.')\
                ns[j++]=ans[i];\
        return String.valueOf(ns); \
    \}\
\}}