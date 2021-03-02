{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /*\
// Definition for a Node.\
class Node \{\
    public int val;\
    public List<Node> children;\
\
    public Node() \{\}\
\
    public Node(int _val) \{\
        val = _val;\
    \}\
\
    public Node(int _val, List<Node> _children) \{\
        val = _val;\
        children = _children;\
    \}\
\};\
*/\
\
class Solution \{\
    List<Integer> ans=new ArrayList<>();\
    public List<Integer> postorder(Node root) \{\
        if(root==null)\
            return ans;\
        for(int i=0; i<root.children.size(); ++i)\
            postorder(root.children.get(i));\
        ans.add(root.val);\
        return ans;\
    \}\
\}}