{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public boolean backspaceCompare(String S, String T) \{\
        Stack<Character> s=new Stack();\
        Stack<Character> t=new Stack();\
        for(int i=0; i<S.length(); ++i)\
        \{\
            if(S.charAt(i)=='#')\
            \{\
                if(!s.isEmpty())\
                    s.pop();\
            \}\
            else\
                s.push(S.charAt(i));\
        \}\
        for(int i=0; i<T.length(); ++i)\
        \{\
            if(T.charAt(i)=='#')\
            \{\
                if(!t.isEmpty())\
                    t.pop();\
            \}\
            else\
                t.push(T.charAt(i));\
        \}\
        if(t.size()!=s.size())\
            return false;\
        while(!t.isEmpty())\
            if(s.pop()!=t.pop())\
                return false;\
        return true;\
    \}\
\}}