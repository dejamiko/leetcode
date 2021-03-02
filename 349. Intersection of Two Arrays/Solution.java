{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] intersection(int[] nums1, int[] nums2) \{\
        List<Integer> ans=new ArrayList<>(); \
        Arrays.sort(nums1);\
        Arrays.sort(nums2);\
        int i=0, j=0;\
        while(i<nums1.length && j<nums2.length)\
        \{\
            if(nums1[i]<nums2[j])\
                i++;\
            else if(nums1[i]>nums2[j])\
                j++;\
            else if(nums1[i]==nums2[j])\
            \{\
                ans.add(nums1[i]);\
                i++;\
                j++;\
            \}\
        \}\
        Set<Integer> set=new LinkedHashSet();\
        set.addAll(ans);\
        ans.clear();\
        ans.addAll(set);\
        int[] answer=new int[ans.size()];\
        for(int k=0; k<ans.size(); ++k)\
            answer[k]=ans.get(k);\
        return answer;\
    \}\
\}}