{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6238\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int countStudents(int[] students, int[] sandwiches) \{\
        ArrayList<Integer> s=new ArrayList();\
        for(int i=0; i<sandwiches.length; ++i)\
            s.add(students[i]);\
        for(int i=0; i<sandwiches.length; ++i)\
        \{\
            boolean eaten=false;\
            int j=0;\
            while(!eaten && j<s.size())\
            \{\
                if(s.get(0)==sandwiches[i])\
                \{\
                    eaten=true;\
                    s.remove(0);\
                    break;\
                \}\
                else\
                \{\
                    s.add(s.remove(0));\
                    j++;\
                \}\
            \}\
            if(!eaten)\
                return s.size();\
        \}\
        return 0;\
    \}\
\}}