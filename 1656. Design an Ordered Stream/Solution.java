{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class OrderedStream \{\
    \
    private String[] huh;\
    private int pointer;\
    \
    public OrderedStream(int n) \{\
        huh=new String[n];\
        pointer=0;\
    \}\
    \
    public List<String> insert(int id, String value) \{\
        ArrayList<String> ans=new ArrayList();\
        huh[id-1]=value;\
        for(int i=pointer; i<huh.length; ++i)\
            if(huh[i]==null)\
                break;\
            else\
            \{\
                ans.add(huh[i]);\
                pointer=i+1;\
            \}\
        return ans;\
    \}\
\}\
\
/**\
 * Your OrderedStream object will be instantiated and called as such:\
 * OrderedStream obj = new OrderedStream(n);\
 * List<String> param_1 = obj.insert(id,value);\
 */}