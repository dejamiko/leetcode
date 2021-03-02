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
    List<Integer> help=new ArrayList();\
    public List<Double> averageOfLevels(TreeNode root) \{\
        List<Double> ans=new ArrayList();\
        helper(root, ans, 0);\
        for(int i=0; i<ans.size(); ++i)\
            ans.set(i, ans.get(i)/help.get(i));\
        return ans;\
    \}\
\
    private void helper(TreeNode node, List<Double> list, int level)\
    \{\
        if(node==null)\
            return;\
        if(list.size()<=level)\
        \{\
            list.add((double)node.val);\
            help.add(1);\
        \}\
        else\
        \{\
            list.set(level, list.get(level)+node.val);\
            help.set(level, help.get(level)+1);\
        \}\
        helper(node.left, list, level+1);\
        helper(node.right, list, level+1);\
    \}\
\}}