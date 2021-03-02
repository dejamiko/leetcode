{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String reverseParentheses(String s) \{\
        char[] arr=s.toCharArray();\
        for(int i=0; i<arr.length; i++)\
        \{\
            int indexl=-1, indexr=-1;\
            for(int j=0; j<arr.length; j++)\
                if(arr[j]=='(')\
                    indexl=j+1;\
            if(indexl<0)\
                break;\
            for(int j=indexl; j<arr.length; j++)\
                if(arr[j]==')')\
                \{\
                    indexr=j-1;\
                    break;\
                \}\
            for(int j=0; j<=(indexr-indexl)/2; j++)\
            \{\
                char t=arr[indexl+j];\
                arr[indexl+j]=arr[indexr-j];\
                arr[indexr-j]=t;\
            \}\
            if(indexl>0)\
            \{\
                arr[indexr+1]='.';\
                arr[indexl-1]='.';\
            \}\
            else\
                break;\
        \}\
        int num=0;\
        for(int i=0; i<arr.length; i++)\
            if(arr[i]=='.')\
                num++;\
        char[] ans=new char[arr.length-num];\
        int j=0;\
        for(int i=0; i<arr.length; i++)\
            if(arr[i]!='.')\
                ans[j++]=arr[i];\
        return String.valueOf(ans);\
    \}\
\}}