{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class MapSum \{\
    HashMap<String, Integer> map;\
    /** Initialize your data structure here. */\
    public MapSum() \{\
        map=new HashMap();\
    \}\
    \
    public void insert(String key, int val) \{\
        map.put(key, val);\
    \}\
    \
    public int sum(String prefix) \{\
        int sum=0;\
        for(String entry: map.keySet())\
            if(entry.startsWith(prefix))\
                sum+=map.get(entry);\
        return sum;\
    \}\
\}\
\
/**\
 * Your MapSum object will be instantiated and called as such:\
 * MapSum obj = new MapSum();\
 * obj.insert(key,val);\
 * int param_2 = obj.sum(prefix);\
 */}