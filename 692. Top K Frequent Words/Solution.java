{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public List<String> topKFrequent(String[] words, int k) \{\
        HashMap<String, Integer> map=new HashMap();\
        for(int i=0; i<words.length; ++i)\
            map.put(words[i], map.getOrDefault(words[i], 0)+1);\
        ArrayList<String> t=new ArrayList(map.keySet());\
        Collections.sort(t, (w1, w2) -> map.get(w1).equals(map.get(w2)) ? w1.compareTo(w2) : map.get(w2)-map.get(w1));\
        return t.subList(0, k);\
    \}\
\}}