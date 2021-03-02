{\rtf1\ansi\ansicpg1252\cocoartf2578
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww20360\viewh6500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /**\
 * Definition for a binary tree node.\
 * public class TreeNode \{\
 *     int val;\
 *     TreeNode left;\
 *     TreeNode right;\
 *     TreeNode() \{\}\
 *     TreeNode(int val) \{ this.val = val; \}\
 *     TreeNode(int val, TreeNode left, TreeNode right) \{\
 *         this.val = val;\
 *         this.left = left;\
 *         this.right = right;\
 *     \}\
 * \}\
 */\
class Solution \{\
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) \{\
        List<Integer> t1=new ArrayList<>();\
        List<Integer> t2=new ArrayList<>();\
        List<Integer> ans=new ArrayList<>();\
        helper(root1, t1);\
        helper(root2, t2);\
        int i=0, j=0;\
        for(; i<t1.size() && j<t2.size();)\
            if(t1.get(i)<t2.get(j))\
                ans.add(t1.get(i++));\
            else\
                ans.add(t2.get(j++));\
        while(i<t1.size())\
            ans.add(t1.get(i++));\
        while(j<t2.size())\
            ans.add(t2.get(j++));\
        return ans;\
    \}\
    \
    public void helper(TreeNode node, List<Integer> arr)\
    \{\
        if(node==null)\
            return;\
        helper(node.left, arr);\
        arr.add(node.val);\
        helper(node.right, arr);\
    \}\
\}}