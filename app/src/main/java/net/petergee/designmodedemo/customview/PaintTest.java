package net.petergee.designmodedemo.customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import net.petergee.designmodedemo.R;

/**
 * @author petergee
 * @date 2018/3/20
 */

public class PaintTest extends View {
    private Paint mPaint;

    public PaintTest(Context context) {
        this(context, null);
    }

    public PaintTest(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PaintTest(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        mPaint = new Paint();
        mPaint.setStrokeWidth(15);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.RED);
        canvas.drawRect(100,100,500,200,mPaint);
        mPaint.setColor(Color.GREEN);
        canvas.drawLine(300,30,450,180,mPaint);
        mPaint.setColor(Color.BLACK);
        canvas.drawText("CUSTOM_VIEW",500,150,mPaint);

        //绘制线性渐变
        /*Shader shader=new LinearGradient(100,100,500,500,Color.parseColor("#2196F3"),Color.parseColor("#E91E63"),Shader.TileMode.CLAMP);
        mPaint.setShader(shader);
        canvas.drawCircle(300,600,200,mPaint);*/

        //绘制辐射渐变
       /* Shader shader2=new RadialGradient(200,200,100,Color.parseColor("#2196F3"),Color.parseColor("#E91E63"),Shader.TileMode.CLAMP);
        mPaint.setShader(shader2);
        canvas.drawCircle(300,300,200,mPaint);*/

        //bitmap着色
        mPaint.setColor(Color.WHITE);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.pic1);
        Shader shader3 = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        mPaint.setShader(shader3);
        canvas.drawCircle(600, 1000, 200, mPaint);



    }
}
