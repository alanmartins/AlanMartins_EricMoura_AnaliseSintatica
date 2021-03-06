/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AMultiplaExp extends PMultiplaExp
{
    private final LinkedList<PMultiExp> _multiExp_ = new LinkedList<PMultiExp>();

    public AMultiplaExp()
    {
        // Constructor
    }

    public AMultiplaExp(
        @SuppressWarnings("hiding") List<PMultiExp> _multiExp_)
    {
        // Constructor
        setMultiExp(_multiExp_);

    }

    @Override
    public Object clone()
    {
        return new AMultiplaExp(
            cloneList(this._multiExp_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiplaExp(this);
    }

    public LinkedList<PMultiExp> getMultiExp()
    {
        return this._multiExp_;
    }

    public void setMultiExp(List<PMultiExp> list)
    {
        this._multiExp_.clear();
        this._multiExp_.addAll(list);
        for(PMultiExp e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._multiExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._multiExp_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PMultiExp> i = this._multiExp_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PMultiExp) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
