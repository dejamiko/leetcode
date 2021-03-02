{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 \
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 class Solution \{\
    public List<List<Integer>> groupThePeople(int[] groupSizes) \{\
        List<List<Integer>> ans=new ArrayList<>();\
        int n=groupSizes.length;\
        List<Integer> arr[]=new ArrayList[n+1];\
        for(int i=1; i<=n; ++i)\
            arr[i]=new ArrayList<Integer>();\
        for(int i=0; i<n; ++i)\
        \{\
            int temp=groupSizes[i];\
            arr[temp].add(i);\
            if(arr[temp].size()==temp)\
            \{\
                ans.add(arr[temp]);\
                arr[temp]=new ArrayList<>();\
            \}\
        \}\
        return ans;\
    \}\
\}}