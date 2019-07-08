package com.necer.ncalendar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

import com.necer.painter.CalendarPainter;
import com.necer.utils.CalendarUtil;

import org.joda.time.LocalDate;

import java.util.List;

/**
 * Created by necer on 2019/1/3.
 */
public class CustomPainter implements CalendarPainter {

    private Paint paint;
    private Context context;


    public CustomPainter(Context context) {
        this.context = context;
        paint = new Paint();
        paint.setTextSize(CalendarUtil.sp2px(context, 15));
        paint.setTextAlign(Paint.Align.CENTER);
    }


//    @Override
//    public void onDrawToday(Canvas canvas, Rect rect, NDate nDate,boolean is) {
//
//        if (false) {
//            paint.setColor(Color.RED);
//            canvas.drawRect(getNewRect(context,rect), paint);
//            paint.setColor(Color.WHITE);
//        } else {
//            paint.setColor(Color.LTGRAY);
//            canvas.drawRect(getNewRect(context,rect), paint);
//            paint.setColor(Color.GREEN);
//        }
//        canvas.drawText(nDate.localDate.getDayOfMonth() + "", rect.centerX(), getBaseLineY(rect), paint);
//
//
//    }
//
//    @Override
//    public void onDrawDisableDate(Canvas canvas, Rect rect, NDate nDate) {
//
//    }
//
//    @Override
//    public void onDrawCurrentMonthOrWeek(Canvas canvas, Rect rect, NDate nDate, boolean isSelect) {
//        if (isSelect) {
//            paint.setColor(Color.BLACK);
//            canvas.drawRect(getNewRect(context,rect), paint);
//            paint.setColor(Color.WHITE);
//        } else {
//            paint.setColor(Color.BLACK);
//        }
//        canvas.drawText(nDate.localDate.getDayOfMonth() + "", rect.centerX(), getBaseLineY(rect), paint);
//
//    }
//
//    @Override
//    public void onDrawNotCurrentMonth(Canvas canvas, Rect rect, NDate nDate,boolean isSelect) {
//        paint.setColor(Color.LTGRAY);
//        canvas.drawText(nDate.localDate.getDayOfMonth() + "", rect.centerX(), getBaseLineY(rect), paint);
//    }


    private int getBaseLineY(Rect rect) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float top = fontMetrics.top;
        float bottom = fontMetrics.bottom;
        int baseLineY = (int) (rect.centerY() - top / 2 - bottom / 2);
        return baseLineY;
    }

    private Rect getNewRect(Context context,Rect rect) {
        int rectDistance = (int) CalendarUtil.dp2px(context, 20);
        return new Rect(rect.centerX() - rectDistance, rect.centerY() - rectDistance, rect.centerX() + rectDistance, rect.centerY() + rectDistance);
    }

    @Override
    public void onDrawToday(Canvas canvas, RectF rectF, LocalDate localDate, List<LocalDate> selectedDateList) {

    }

    @Override
    public void onDrawCurrentMonthOrWeek(Canvas canvas, RectF rectF, LocalDate localDate, List<LocalDate> selectedDateList) {

    }

    @Override
    public void onDrawLastOrNextMonth(Canvas canvas, RectF rectF, LocalDate localDate, List<LocalDate> selectedDateList) {

    }

    @Override
    public void onDrawDisableDate(Canvas canvas, RectF rectF, LocalDate localDate) {

    }
}
