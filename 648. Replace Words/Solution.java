{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public String replaceWords(List<String> dictionaryo, String sentence) \{\
        List<String> dictionary=new ArrayList(dictionaryo);\
        for(int i=0; i<dictionary.size(); ++i)\
            for(int j=0; j<dictionary.size(); ++j)\
                if(i!=j && i<dictionary.size() && j<dictionary.size() && dictionary.get(i).startsWith(dictionary.get(j)))\
                    dictionary.remove(i);\
        String[] words=sentence.split(" ");\
        for(int j=0; j<words.length; ++j)\
            for(int i=0; i<dictionary.size(); ++i)\
                if(words[j].startsWith(dictionary.get(i)))\
                \{\
                    words[j]=dictionary.get(i);\
                \}\
        String ans="";\
        for(int j=0; j<words.length; ++j)\
            ans=ans+words[j]+" ";\
        return ans.trim();\
    \}\
\}}