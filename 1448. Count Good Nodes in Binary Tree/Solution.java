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
    int ans=0;\
    public int goodNodes(TreeNode root) \{\
        helper(root, root.val);\
        return ans;\
    \}\
    public void helper(TreeNode node, int max) \{\
        if(node==null)\
            return;\
        if(node.val>=max)\
            ans++;\
        helper(node.right, Math.max(max, node.val));\
        helper(node.left, Math.max(max, node.val));\
    \}\
    \
\}}