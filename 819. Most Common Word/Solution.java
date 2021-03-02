{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String mostCommonWord(String paragraph, String[] banned) \{\
        String[] words = paragraph.toLowerCase().split("[^a-zA-Z]");\
        HashMap<String, Integer> m=new HashMap<>();\
        HashSet<String> s=new HashSet();\
        for(int i=0; i<banned.length; ++i)\
            s.add(banned[i]);\
        for(int i=0; i<words.length; ++i)\
        \{\
            if(!s.contains(words[i]) && words[i].trim().length()>0)\
            \{\
                if(!m.containsKey(words[i]))\
                    m.put(words[i], 1);\
                else\
                    m.replace(words[i], m.get(words[i])+1);\
            \}\
        \}\
        int max=0;\
        String f="";\
        Iterator<Map.Entry<String, Integer>> it=m.entrySet().iterator();\
        while(it.hasNext())\
        \{\
            Map.Entry<String, Integer> e=it.next();\
            if(e.getValue()>=max)\
            \{\
                max=e.getValue();\
                f=e.getKey();\
            \}\
        \}\
        return f;\
    \}\
\}}