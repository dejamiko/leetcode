{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) \{\
        List<Boolean> ans=new ArrayList<>();\
        for(int i=0; i<l.length; ++i)\
        \{\
            int[] t=new int[r[i]-l[i]+1];\
            int index=0;\
            for(int j=l[i]; j<=r[i]; ++j)\
            \{\
                t[index++]=nums[j];\
            \}\
            Arrays.sort(t);\
            boolean works=true;\
            for(int j=0; works && j+2<index; ++j)\
                if(t[j+1]-t[j]!=t[j+2]-t[j+1])\
                    works=false;\
            ans.add(works);\
        \}\
        return ans;\
    \}\
\}}