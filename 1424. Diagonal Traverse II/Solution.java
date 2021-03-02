{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] findDiagonalOrder(List<List<Integer>> nums) \{\
        int n=nums.size(), m=0, count=0;\
        for(int i=0; i<n; ++i)\
            m=Math.max(m, nums.get(i).size());\
        ArrayList<ArrayList<Integer>> t=new ArrayList();\
        for(int i=0; i<n; ++i)\
            for(int j=0; j<nums.get(i).size(); ++j)\
                if(t.size()<=i+j)\
                \{\
                    ArrayList<Integer> l=new ArrayList();\
                    l.add(nums.get(i).get(j));\
                    t.add(l);\
                    count++;\
                \}\
                else\
                \{\
                    ArrayList<Integer> l=t.remove(i+j);\
                    l.add(nums.get(i).get(j));\
                    t.add(i+j, l);\
                    count++;\
                \}\
        int[] ans=new int[count];\
        int k=0;\
        for(int i=0; i<t.size(); ++i)\
            for(int j=t.get(i).size()-1; j>=0; --j)\
                ans[k++]=t.get(i).get(j);\
        return ans;\
    \}\
\}}