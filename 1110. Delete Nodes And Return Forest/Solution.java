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
    List<TreeNode> ans=new ArrayList();\
    Set<Integer> deleted=new HashSet();\
    \
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) \{\
        for(int i=0; i<to_delete.length; ++i)\
            deleted.add(to_delete[i]);\
        helper(root, null);\
        return ans;\
    \}\
    \
    public void helper(TreeNode node, TreeNode parent)\
    \{\
        if(node==null)\
            return;\
        if(deleted.contains(node.val))\
        \{\
            if(parent!=null)\
            \{\
                if(parent.left==node)\
                    parent.left=null;\
                else\
                    parent.right=null;\
            \}\
            helper(node.left, null);\
            helper(node.right, null);\
        \}\
        else\
        \{\
            if(parent==null)\
                ans.add(node);\
            helper(node.left, node);\
            helper(node.right, node);\
        \}\
    \}\
\}}