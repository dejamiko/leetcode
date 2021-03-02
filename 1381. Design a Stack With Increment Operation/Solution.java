{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class CustomStack \{\
\
    int size=0;\
    int max=0;\
    int stack[];\
    \
    public CustomStack(int maxSize) \{\
        stack=new int[maxSize];\
        max=maxSize;\
    \}\
    \
    public void push(int x) \{\
        if(size<max)\
            stack[size++]=x;\
    \}\
    \
    public int pop() \{\
        if(size>0)\
            return stack[--size];\
        return -1;\
    \}\
    \
    public void increment(int k, int val) \{\
        k=Math.min(k, size);\
        for(int i=0; i<k; ++i)\
        \{\
            stack[i]+=val;\
        \}\
    \}\
\}\
\
/**\
 * Your CustomStack object will be instantiated and called as such:\
 * CustomStack obj = new CustomStack(maxSize);\
 * obj.push(x);\
 * int param_2 = obj.pop();\
 * obj.increment(k,val);\
 */}