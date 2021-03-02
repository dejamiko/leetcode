{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public void gameOfLife(int[][] board) \{\
        //2 is going to die, 3 is going to be born\
        for(int i=0; i<board.length; ++i)\
            for(int j=0; j<board[i].length; ++j)\
            \{\
                int t=0;\
                if(i>0 && j>0 && (board[i-1][j-1]==1 || board[i-1][j-1]==2))\
                    t++;\
                if(i>0 && (board[i-1][j]==1 || board[i-1][j]==2))\
                    t++;\
                if(i>0 && j+1<board[i].length && (board[i-1][j+1]==1 || board[i-1][j+1]==2))\
                    t++;\
                if(j>0 && (board[i][j-1]==1 || board[i][j-1]==2))\
                    t++;\
                if(j+1<board[i].length && (board[i][j+1]==1 || board[i][j+1]==2))\
                    t++;\
                if(j>0 && i+1<board.length && (board[i+1][j-1]==1 || board[i+1][j-1]==2))\
                    t++;\
                if(i+1<board.length && (board[i+1][j]==1 || board[i+1][j]==2))\
                    t++;\
                if(i+1<board.length && j+1<board[i].length && (board[i+1][j+1]==1 || board[i+1][j+1]==2))\
                    t++;\
                if((t<2 || t>3) && board[i][j]==1)\
                    board[i][j]=2;\
                if(board[i][j]==0 && t==3)\
                    board[i][j]=3;\
            \}\
        for(int i=0; i<board.length; ++i)\
            for(int j=0; j<board[i].length; ++j)\
                if(board[i][j]==2)\
                    board[i][j]=0;\
                else if(board[i][j]==3)\
                    board[i][j]=1;\
    \}\
\}}