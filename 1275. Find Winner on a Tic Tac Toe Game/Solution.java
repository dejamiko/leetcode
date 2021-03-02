{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String tictactoe(int[][] moves) \{\
        int[][] b=new int[3][3];\
        \
        for(int i=0; i<moves.length; ++i)\
            if(i%2==0)\
                b[moves[i][0]][moves[i][1]]=1;\
            else\
                b[moves[i][0]][moves[i][1]]=2;\
        \
        if(b[0][0]==1 && b[0][1]==1 && b[0][2]==1)\
            return "A";\
        if(b[1][0]==1 && b[1][1]==1 && b[1][2]==1)\
            return "A";\
        if(b[2][0]==1 && b[2][1]==1 && b[2][2]==1)\
            return "A";\
        if(b[0][0]==1 && b[1][1]==1 && b[2][2]==1)\
            return "A";\
        if(b[2][0]==1 && b[1][1]==1 && b[0][2]==1)\
            return "A";\
        if(b[0][0]==1 && b[1][0]==1 && b[2][0]==1)\
            return "A";\
        if(b[0][1]==1 && b[1][1]==1 && b[2][1]==1)\
            return "A";\
        if(b[0][2]==1 && b[1][2]==1 && b[2][2]==1)\
            return "A";\
        \
        if(b[0][0]==2 && b[0][1]==2 && b[0][2]==2)\
            return "B";\
        if(b[1][0]==2 && b[1][1]==2 && b[1][2]==2)\
            return "B";\
        if(b[2][0]==2 && b[2][1]==2 && b[2][2]==2)\
            return "B";\
        if(b[0][0]==2 && b[1][1]==2 && b[2][2]==2)\
            return "B";\
        if(b[2][0]==2 && b[1][1]==2 && b[0][2]==2)\
            return "B";\
        if(b[0][0]==2 && b[1][0]==2 && b[2][0]==2)\
            return "B";\
        if(b[0][1]==2 && b[1][1]==2 && b[2][1]==2)\
            return "B";\
        if(b[0][2]==2 && b[1][2]==2 && b[2][2]==2)\
            return "B";\
        \
        if(moves.length==9)\
            return "Draw";\
        return "Pending";\
    \}\
\}}