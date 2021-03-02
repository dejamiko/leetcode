{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String[] findRestaurant(String[] list1, String[] list2) \{\
        int min=list1.length+list2.length;\
        ArrayList<String> a=new ArrayList();\
        for(int i=0; i<list1.length; ++i)\
            for(int j=0; j<list2.length; ++j)\
            \{\
                if(i+j>min)\
                    break;\
                if(list1[i].equals(list2[j]) && i+j<=min)\
                    min=i+j;\
            \}\
        for(int i=0; i<list1.length; ++i)\
            for(int j=0; j<list2.length; ++j)\
                if(list1[i].equals(list2[j]) && i+j==min)\
                    a.add(list1[i]);\
        String[] ans=new String[a.size()];\
        for(int i=0; i<a.size(); ++i)\
            ans[i]=a.get(i);\
        return ans;\
    \}\
\}}