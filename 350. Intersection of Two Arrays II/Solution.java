{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] intersect(int[] nums1, int[] nums2) \{\
        ArrayList<Integer> t=new ArrayList<>();\
        for(int i=0; i<nums1.length; ++i)\
            for(int j=0; j<nums2.length; ++j)\
                if(nums1[i]==nums2[j])\
                \{\
                    t.add(nums1[i]);\
                    nums2[j]=-1;\
                    break;\
                \}\
        int[] ans=new int[t.size()];\
        for(int i=0; i<t.size(); ++i)\
            ans[i]=t.get(i);\
        return ans;\
    \}\
\}}