{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] topKFrequent(int[] nums, int k) \{\
        HashMap<Integer, Integer> a=new HashMap();\
        for(int i=0; i<nums.length; ++i)\
            if(!a.containsKey(nums[i]))\
                a.put(nums[i], 1);\
            else\
                a.put(nums[i], a.get(nums[i])+1);\
        int[] ans=new int[k];\
        for(int i=0; i<k; ++i)\
        \{\
            int max=0;\
            Iterator it=a.entrySet().iterator();\
            while(it.hasNext())\
            \{\
                Map.Entry mapElement = (Map.Entry)it.next();\
                if((int)mapElement.getValue()>max)\
                \{\
                    max=(int)mapElement.getValue();\
                    ans[i]=(int)mapElement.getKey();    \
                \}\
            \}\
            a.remove(ans[i]);\
        \}\
        return ans;\
    \}\
\}}