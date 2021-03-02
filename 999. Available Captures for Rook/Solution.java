{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int numRookCaptures(char[][] board) \{\
        int index1=0, index2=0, ans=0;\
        boolean isRook=true;\
        for(int i=0; isRook && i<8; ++i)\
            for(int j=0; isRook && j<8; ++j)\
                if(board[i][j]=='R')\
                \{\
                    index1=i;\
                    index2=j;\
                    isRook=false;\
                \}\
        for(int i=index1+1; i<8; ++i)\
        \{\
            if(board[i][index2]=='B')\
                break;\
            if(board[i][index2]=='p')\
            \{\
                ans++;\
                break;\
            \}\
        \}\
        for(int i=index1-1; i>=0; --i)\
        \{\
            if(board[i][index2]=='B')\
                break;\
            if(board[i][index2]=='p')\
            \{\
                ans++;\
                break;\
            \}\
        \}\
        for(int i=index2+1; i<8; ++i)\
        \{\
            if(board[index1][i]=='B')\
                break;\
            if(board[index1][i]=='p')\
            \{\
                ans++;\
                break;\
            \}\
        \}\
        for(int i=index2-1; i>=0; --i)\
        \{\
            if(board[index1][i]=='B')\
                break;\
            if(board[index1][i]=='p')\
            \{\
                ans++;\
                break;\
            \}\
        \}\
        return ans;\
    \}\
\}}