package com.example.vaiojun.login_4d.Object;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Jun Li on 02/05/17.
 */

public class SampleObject implements Parcelable {
    private int id;
    private int activity_number;
    private String description;
    private int module_id;
    private String activity_objective;
    private String result;
    private int activity_time;
    private String materials;
    private String instruction;

    public SampleObject(int id, int activity_number, String description,
                        int module_id, String activity_objective, String result,
                        int activity_time, String materials, String instruction) {
        this.id = id;
        this.activity_number = activity_number;
        this.description = description;
        this.module_id = module_id;
        this.activity_objective = activity_objective;
        this.result = result;
        this.activity_time = activity_time;
        this.materials = materials;
        this.instruction = instruction;
    }

    protected SampleObject(Parcel in) {
        id = in.readInt();
        activity_number = in.readInt();
        description = in.readString();
        module_id = in.readInt();
        activity_objective = in.readString();
        result = in.readString();
        activity_time = in.readInt();
        materials = in.readString();
        instruction = in.readString();
    }

    public static final Parcelable.Creator<SampleObject> CREATOR = new Creator<SampleObject>() {
        @Override
        public SampleObject createFromParcel(Parcel in) {
            return new SampleObject(in);
        }

        @Override
        public SampleObject[] newArray(int size) {
            return new SampleObject[size];
        }
    };

    public int getId() {
        return id;
    }

    public int getActivity_number() {
        return activity_number;
    }

    public String getDescription() {
        return description;
    }

    public int getModule_id() {
        return module_id;
    }

    public String getActivity_objective() {
        return activity_objective;
    }

    public String getResult() {
        return result;
    }

    public int getActivity_time() {
        return activity_time;
    }

    public String getMaterials() {
        return materials;
    }

    public String getInstruction() {
        return instruction;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeInt(this.activity_number);
        dest.writeString(this.description);
        dest.writeInt(this.module_id);
        dest.writeString(this.activity_objective);
        dest.writeString(this.result);
        dest.writeInt(this.activity_time);
        dest.writeString(this.materials);
        dest.writeString(this.instruction);
    }

}
