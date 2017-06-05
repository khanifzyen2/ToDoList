package id.ac.unisnu.tif.todolist.other

/**
 * Created by labsaintek on 6/5/2017.
 */

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapShader
import android.graphics.Canvas
import android.graphics.Paint

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation
import com.bumptech.glide.load.resource.bitmap.TransformationUtils

class CircleTransform : BitmapTransformation {

    fun CircleTransform(context: Context) =  super (context)

    override fun transform(pool: BitmapPool, toTransform: Bitmap, outWidth: Int, outHeight: Int): Bitmap = circleCrop(pool,toTransform)

    fun circleCrop (pool: BitmapPool, source: Bitmap) {

        val  size: Int = Math.min(source.getScaledHeight(),source.getScaledWidth())
        val x: Int = (source.getScaledWidth()/2)
        val y: Int = (source.getScaledHeight()/2)

        //TODO this should be acquired from the pool to
        val squared: Bitmap = Bitmap.createBitmap(size,size,)

    }
}