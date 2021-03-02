{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 public class Codec \{\
\
    // Encodes a URL to a shortened URL.\
    public String encode(String longUrl) \{\
        String ans="http://tinyurl.com/";\
        for(int i=0; i<longUrl.length(); ++i)\
            ans+=(char)(longUrl.charAt(i)+1);\
        return ans;\
    \}\
\
    // Decodes a shortened URL to its original URL.\
    public String decode(String shortUrl) \{\
        String ans="";\
        for(int i=19; i<shortUrl.length(); ++i)\
            ans+=(char)(shortUrl.charAt(i)-1);\
        return ans;\
    \}\
\}\
\
// Your Codec object will be instantiated and called as such:\
// Codec codec = new Codec();\
// codec.decode(codec.encode(url));}