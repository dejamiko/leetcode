{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class BrowserHistory \{\
\
    List<String> hist;\
    int current;\
    public BrowserHistory(String homepage) \{\
        hist=new ArrayList();\
        hist.add(homepage);\
        current=0;\
    \}\
    \
    public void visit(String url) \{\
        hist.subList(current+1, hist.size()).clear();\
        hist.add(url);\
        current++;\
    \}\
    \
    public String back(int steps) \{\
        current=Math.max(0, current-steps);\
        return hist.get(current);\
    \}\
    \
    public String forward(int steps) \{\
        current=Math.min(hist.size()-1, current+steps);\
        return hist.get(current);\
    \}\
\}\
\
/**\
 * Your BrowserHistory object will be instantiated and called as such:\
 * BrowserHistory obj = new BrowserHistory(homepage);\
 * obj.visit(url);\
 * String param_2 = obj.back(steps);\
 * String param_3 = obj.forward(steps);\
 */}