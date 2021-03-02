{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class ProductOfNumbers \{\
    List<Integer> list;\
    int LastZero;\
    \
    public ProductOfNumbers() \{\
        list=new ArrayList();\
        LastZero=-1;\
    \}\
    \
    public void add(int num) \{\
        if(num==0)\
        \{\
            LastZero=list.size();\
            list.add(1);\
        \}\
        else\
        \{\
            if(list.size()==0)\
                list.add(num);\
            else\
                list.add(list.get(list.size()-1)*num);\
        \}\
    \}\
    \
    public int getProduct(int k) \{\
        if(LastZero>=list.size()-k)\
            return 0;\
        if(k==list.size())\
            return list.get(list.size()-1);\
        return list.get(list.size()-1)/list.get(list.size()-k-1);\
    \}\
\}\
\
/**\
 * Your ProductOfNumbers object will be instantiated and called as such:\
 * ProductOfNumbers obj = new ProductOfNumbers();\
 * obj.add(num);\
 * int param_2 = obj.getProduct(k);\
 */}