{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class MyHashSet \{\
    ArrayList<Integer> set;\
    public MyHashSet() \{\
        set=new ArrayList();\
    \}\
    \
    public void add(int key) \{\
        if(!contains(key))\
            set.add(key);\
    \}\
    \
    public void remove(int key) \{\
        for(int i=0; i<set.size(); ++i)\
            if(key==set.get(i))\
                set.remove(i);\
    \}\
    \
    /** Returns true if this set contains the specified element */\
    public boolean contains(int key) \{\
        for(int i=0; i<set.size(); ++i)\
            if(key==set.get(i))\
                return true;\
        return false;\
    \}\
\}\
\
/**\
 * Your MyHashSet object will be instantiated and called as such:\
 * MyHashSet obj = new MyHashSet();\
 * obj.add(key);\
 * obj.remove(key);\
 * boolean param_3 = obj.contains(key);\
 */}