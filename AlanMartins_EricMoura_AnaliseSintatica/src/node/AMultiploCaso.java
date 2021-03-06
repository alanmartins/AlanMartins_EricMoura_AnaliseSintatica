/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AMultiploCaso extends PMultiploCaso
{
    private final LinkedList<PDefinicaoCaso> _definicaoCaso_ = new LinkedList<PDefinicaoCaso>();

    public AMultiploCaso()
    {
        // Constructor
    }

    public AMultiploCaso(
        @SuppressWarnings("hiding") List<PDefinicaoCaso> _definicaoCaso_)
    {
        // Constructor
        setDefinicaoCaso(_definicaoCaso_);

    }

    @Override
    public Object clone()
    {
        return new AMultiploCaso(
            cloneList(this._definicaoCaso_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultiploCaso(this);
    }

    public LinkedList<PDefinicaoCaso> getDefinicaoCaso()
    {
        return this._definicaoCaso_;
    }

    public void setDefinicaoCaso(List<PDefinicaoCaso> list)
    {
        this._definicaoCaso_.clear();
        this._definicaoCaso_.addAll(list);
        for(PDefinicaoCaso e : list)
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
            + toString(this._definicaoCaso_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._definicaoCaso_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PDefinicaoCaso> i = this._definicaoCaso_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDefinicaoCaso) newChild);
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
