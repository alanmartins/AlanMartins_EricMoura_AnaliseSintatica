/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TLColc extends Token
{
    public TLColc()
    {
        super.setText("[");
    }

    public TLColc(int line, int pos)
    {
        super.setText("[");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLColc(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLColc(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLColc text.");
    }
}
