{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) \{\
        List<List<Integer>> ans=new ArrayList();\
        boolean rowr=true;\
        for(int i=king[0]+1; rowr && i<8; ++i) //row to right\
            for(int q=0; rowr && q<queens.length; ++q)\
                if(i==queens[q][0] && king[1]==queens[q][1])\
                \{\
                    List<Integer> t=new ArrayList();\
                    t.add(queens[q][0]);\
                    t.add(queens[q][1]);\
                    ans.add(t);\
                    rowr=false;\
                \}\
        boolean rowl=true;\
        for(int i=king[0]-1; rowl && i>=0; --i) //row to left\
            for(int q=0;  rowl && q<queens.length; ++q)\
                if(i==queens[q][0] && king[1]==queens[q][1])\
                \{\
                    List<Integer> t=new ArrayList();\
                    t.add(queens[q][0]);\
                    t.add(queens[q][1]);\
                    ans.add(t);\
                    rowl=false;\
                \}\
        boolean cod=true;\
        for(int i=king[1]+1; cod && i<8; ++i) //col down\
            for(int q=0; cod && q<queens.length; ++q)\
                if(i==queens[q][1] && king[0]==queens[q][0])\
                \{\
                    List<Integer> t=new ArrayList();\
                    t.add(queens[q][0]);\
                    t.add(queens[q][1]);\
                    ans.add(t);\
                    cod=false;\
                \}\
        boolean cou=true;\
        for(int i=king[1]-1; cou && i>=0; --i) //col up\
            for(int q=0; cou && q<queens.length; ++q)\
                if(i==queens[q][1] && king[0]==queens[q][0])\
                \{\
                    List<Integer> t=new ArrayList();\
                    t.add(queens[q][0]);\
                    t.add(queens[q][1]);\
                    ans.add(t);\
                    cou=false;\
                \}\
        boolean drd=true;\
        for(int i=king[0]+1, j=king[1]+1; drd && i<8 && j<8; ++i, ++j) //diag right down\
            for(int q=0; drd && q<queens.length; ++q)\
                if(i==queens[q][0] && j==queens[q][1])\
                \{\
                    List<Integer> t=new ArrayList();\
                    t.add(queens[q][0]);\
                    t.add(queens[q][1]);\
                    ans.add(t);\
                    drd=false;\
                \}\
        boolean dru=true;\
        for(int i=king[0]+1, j=king[1]-1; dru && i<8 && j>=0; ++i, --j) //diag right up\
            for(int q=0; dru && q<queens.length; ++q)\
                if(i==queens[q][0] && j==queens[q][1])\
                \{\
                    List<Integer> t=new ArrayList();\
                    t.add(queens[q][0]);\
                    t.add(queens[q][1]);\
                    ans.add(t);\
                    dru=false;\
                \}\
        boolean dld=true;\
        for(int i=king[0]-1, j=king[1]+1; dld && i>=0 && j<8; --i, ++j) //diag left down\
            for(int q=0; dld && q<queens.length; ++q)\
                if(i==queens[q][0] && j==queens[q][1])\
                \{\
                    List<Integer> t=new ArrayList();\
                    t.add(queens[q][0]);\
                    t.add(queens[q][1]);\
                    ans.add(t);\
                    dld=false;\
                \}\
        boolean dlu=true;\
        for(int i=king[0]-1, j=king[1]-1; dlu && j>=0 && j>=0; --i, --j) //diag left up\
            for(int q=0; dlu && q<queens.length; ++q)\
                if(i==queens[q][0] && j==queens[q][1])\
                \{\
                    List<Integer> t=new ArrayList();\
                    t.add(queens[q][0]);\
                    t.add(queens[q][1]);\
                    ans.add(t);\
                    dlu=false;\
                \}\
        return ans;\
    \}\
\}}